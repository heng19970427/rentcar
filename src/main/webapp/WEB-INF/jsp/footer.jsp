<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/17
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
    const baseUrl = 'http://car.xiaoliublog.cn:8080';
    axios.defaults.baseURL = 'http://car.xiaoliublog.cn:8080/Rentcar';
    function isValidPhone(phone) {
        const reg = /^1[3|4|5|7|8][0-9]\d{8}$/;
        return reg.test(phone);
    }
    Date.prototype.format = function(format) {
        let o = {
            "M+" : this.getMonth()+1, //month
            "d+" : this.getDate(),    //day
            "h+" : this.getHours(),   //hour
            "m+" : this.getMinutes(), //minute
            "s+" : this.getSeconds(), //second
            "q+" : Math.floor((this.getMonth()+3)/3),  //quarter
            "S" : this.getMilliseconds() //millisecond
        };
        if(/(y+)/.test(format)) format=format.replace(RegExp.$1,
            (this.getFullYear()+"").substr(4 - RegExp.$1.length));
        for(let k in o)if(new RegExp("("+ k +")").test(format))
            format = format.replace(RegExp.$1,
                RegExp.$1.length===1 ? o[k] :
                    ("00"+ o[k]).substr((""+ o[k]).length));
        return format;
    };
    function changeDateFormat(str) {
        let year = str.substring(0,4);
        let mon = str.substring(4,6);
        let day = str.substring(6,8);
        return year+'-'+mon+'-'+day;
    }

    let app = new Vue({
        el: '#app',
        data() {
            let checkPhone =  (rule, value, callback) => {
                if (value === '' || !value){
                    return callback(new Error('手机号不能为空!'))
                }else if (!isValidPhone(value)){
                    return callback(new Error('无效手机号'))
                } else {
                    callback()
                }
            };
            return {
                user: {
                    username: '顺丰租车',
                    userId: 3,
                },
                cars: [],
                disCountPackages: [],
                carId: 0,
                disCountPackageId: 0,
                active: 0,
                orders: [],
                orderForm: {
                    phone: '',
                    idCard: {
                        name: '',
                        sex: '',
                        folk: '',
                        birthday: '',
                        idNumber: '',
                        address: '',
                        agency: '',
                        expireStart: null,
                        expireEnd: ''
                    },
                    car: null,
                    discountPackage: {
                        disCountPackageId: 1,
                        disCountFee: 30.0,
                        day: 4,
                        belong: null
                    },
                    belong: null,
                    rentDate: new Date().format('yyyy-MM-dd'),
                    returnDate: new Date().format('yyyy-MM-dd'),
                },
                IdCard: {
                    name: '',
                    sex: '',
                    folk: '',
                    birthday: '',
                    idNumber: '',
                    address: '',
                    agency: '',
                    expireStart: '',
                    expireEnd: ''
                },
                rules: {
                    phone:[
                        {validator: checkPhone, trigger:'change' },
                        {required:true, message: '请输入手机号', trigger: 'blur'}
                    ],
                    'IdCard.name':[
                        {required:true, message: '请输入姓名', trigger: 'blur'}
                    ],
                    'IdCard.sex':[
                        {required:true, message: '请输入性别', trigger: 'blur'}
                    ],
                    'IdCard.folk':[
                        {required:true, message: '请输入民族', trigger: 'blur'}
                    ],
                    'IdCard.birthday':[
                        {required:true, message: '请输入生日', trigger: 'change'}
                    ],
                    'IdCard.idNumber':[
                        {required:true, message:'请输入身份证号码', trigger: 'blur'}
                    ],
                    'IdCard.address':[
                        {required:true, message:'请输入住址', trigger: 'blur'}
                    ],
                    'IdCard.agency':[
                        {required:true, message:'请输入签发机关', trigger: 'blur'}
                    ],
                    'IdCard.expireStart':[
                        {required:true, message:'请输入有效期限', trigger: 'change'}
                    ],
                    'IdCard.expireEnd':[
                        {required:true, message:'请输入有效期限', trigger: 'blur'}
                    ]
                }
            }
        },
        created: function () {
            this.getCars();
            this.getDisCountPackages();
            this.getOrders(this.user.userId,'','出租中');
        },
        methods: {
            next() {
                if (this.active === 0) {
                    if (this.carId === 0) {
                        this.$notify({
                            'title': '还未选择车辆',
                            'message': '必须选择车辆才能进入下一步',
                            'type': 'error'
                        })
                    } else {
                        this.active++;
                    }
                } else {
                    this.active++;
                }
                if (this.active > 2) this.active = 0;
            },
            pre() {
                if (this.active-- < 1) this.active = 0;
            },
            submit(formName) {
                this.orderForm.belong = this.user;
                this.$refs[formName].validate((valid) => {
                    if (valid) {
                        let vm = this;
                        axios.post('/order/api_v1/create_order',vm.orderForm)
                            .then(function (resp) {
                                if (resp.data.code === 0) {
                                    vm.$notify({
                                        title: '成功',
                                        message: '订单创建成功!',
                                        type: 'success'
                                    });
                                    vm.active = 0;
                                }else {
                                    vm.$notify({
                                        title: '创建失败',
                                        message: resp.data.msg,
                                        type: 'error'
                                    })
                                }
                            });
                    } else {
                        this.$notify({
                            title: '不能提交',
                            message: '请完善信息!',
                            type: 'error'
                        });
                        return false;
                    }
                });
            },
            orderCarID($index) {
                this.orderForm.car = this.cars[$index];
                this.carId = this.cars[$index].carId;
                this.$notify({
                    title: '选择成功',
                    message: '已选择车辆 ' + this.cars[$index].type,
                    type: 'success'
                });
            },
            getCars() {
                let vm = this;
                axios.get('/car/api_v1/all_car?userId=' + this.user.userId)
                    .then(function (resp) {
                        console.log(resp);
                        vm.cars = resp.data;
                    }).catch(function (e) {
                    console.log(e)
                });
            },
            getDisCountPackages() {
                let vm = this;
                axios.get('/discount/api_v1/get_allDiscount?userId=' + this.user.userId)
                    .then(function (resp) {
                        console.log(resp);
                        vm.disCountPackages = resp.data;
                    }).catch(function (e) {
                    console.log(e);
                })
            },
            readCard() {
                let vm = this;
                ws.onmessage = sMessage;

                function sMessage(msg) {
                    let json = JSON.parse(msg.data);
                    let act = json['act'];
                    let data = json['data'];
                    if (act === 'init') {
                        if (data) {
                            console.log("初始化成功!");
                            ws.send('auth');
                        } else {
                            vm.$notify({
                                'title': '设备未就绪',
                                'message': '请检查驱动及设备是否安装好!并刷新页面',
                                'type': 'error'
                            })
                        }
                    } else if (act === 'auth') {
                        if (data) {
                            ws.send('read')
                        } else {
                            vm.$notify({
                                'title': '未放置身份证',
                                'message': '请放置身份证, 若已放置请拿起重放!',
                                'type': 'warning'
                            })
                        }
                    } else if (act === 'read') {
                        if (data === false) {
                            vm.$notify({
                                'title': '读取失败',
                                'message': '读取身份证失败!',
                                'type': 'error'
                            })
                        } else {
                            let str = decodeURIComponent(data);
                            let info = str.split(',');
                            vm.IdCard.name = info[0];
                            vm.IdCard.sex = info[1];
                            vm.IdCard.folk = info[2];
                            vm.IdCard.birthday = changeDateFormat(info[3]);
                            vm.IdCard.idNumber = info[4];
                            vm.IdCard.address = info[5];
                            vm.IdCard.agency = info[6];
                            vm.IdCard.expireStart = changeDateFormat(info[7]);
                            if (info[8].length === 8) info[8] = changeDateFormat(info[8]);
                            vm.IdCard.expireEnd = info[8];
                            vm.orderForm.IdCard = vm.IdCard;
                        }
                    }
                }
                ws.send('init');
            },
            getOrders(bid,uid,status) {
                let vm = this;
                axios.post('/order/api_v1/get_userAllOrder',{
                    belongId:bid,
                    uid:uid,
                    status:status
                }).then(function (resp) {
                    vm.orders = resp.data;
                }).catch(function (e) {
                    console.log(e);
                })
            },
            filterHandler(value, row, column) {
                const property = column['property'];
                return row[property] === value;
            }
        },
        computed: {
            fee: function () {
                if (this.orderForm.car !== null) {
                    let sCar = this.orderForm.car;
                    let sDP = null;
                    if (this.disCountPackageId === 0) {
                        return sCar.rentFee;
                    }
                    for (let dp of this.disCountPackages) {
                        if (dp.disCountPackageId === this.disCountPackageId) {
                            sDP = dp;
                            this.orderForm.discountPackage = dp;
                        }
                    }
                    return sCar.rentFee - (sDP.disCountFee * sDP.day);
                }
                return 0;
            },
            rentLong: {
                get: function () {
                    return [this.orderForm.rentDate,this.orderForm.returnDate]
                },
                set: function (newDate) {
                    this.orderForm.rentDate = newDate[0];
                    this.orderForm.returnDate = newDate[1];
                }
            }
        }
    })
</script>
