<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/17
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
    Vue.component('CarsCardList', {
        template: '<el-col :span="12" v-for="(car,index) in cars">\n' +
        '        <el-card>\n' +
        '            <img :src="car.images[0].path" class="image">\n' +
        '            <div>\n' +
        '                <span>{{ car.type }} </span>\n' +
        '                <span>{{ car.desc }}</span>\n' +
        '                <span>{{ car.fuelType }}</span>\n' +
        '                <div class="bottom clearfix">\n' +
        '                    <el-button>查看详情</el-button>\n' +
        '                    <el-button @click="orderCarID(index)" :data-carid="car.carId">选择该车</el-button>\n' +
        '                </div>\n' +
        '            </div>\n' +
        '        </el-card>\n' +
        '    </el-col>',
        props: {
            cars: Array,
        },
        name: 'CarsCardList',
        data(){
            return {
                cars: null,
            }
        }
    });

    new Vue({
        el: '#app',
        data(){
            return {
            user: {
                name: '顺丰租车',
                userId: 3,
            },
            cars: [],
            active: 0,
            orderForm: {
                carId: 0,
            }
        }},
        methods: {
            next() {
                if (this.active++ > 2) this.active = 0;
            },
            pre() {
                if (this.active-- < 1) this.active = 0;
            },
            submit() {
                this.$notify({
                    title: '成功',
                    message: '订单创建成功!',
                    type: 'success'
                })
            },
            orderCarID($index) {
                this.orderForm.carId = this.cars[$index].carId;
                this.$notify({
                    title: '选择成功',
                    message: '已选择车辆 '+this.cars[$index].type,
                    type: 'success'
                });
            },
            getCars(userId) {
                axios.get('/car/api_v1/all_car?userId='+this.user.userId)
                    .then(function (resp) {

                    })
            }
        },
    })
</script>
