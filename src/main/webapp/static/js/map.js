let map = new AMap.Map('mapContainer', {
    center:[114.995299,27.144202],
    zoom:13
});
AMap.plugin('AMap.ToolBar',function(){
    let toolbar = new AMap.ToolBar();
    map.addControl(toolbar)
});

AMapUI.loadUI(['misc/MarkerList'],function (MarkerList) {
    let markerList = new MarkerList({
        //关联map对象
        map:map,
        //列表容器的id
        listContainer: 'car-list',
        //选中状态（通过点击列表或者marker）时在Marker和列表节点上添加的class，可以借此编写css控制选中时的展示效果
        selectedClassNames: 'selected',

        //返回数据项的Id
        getDataId: function(dataItem, index) {
            //index表示该数据项在数组中的索引位置，从0开始，如果确实没有id，可以返回index代替
            return dataItem.id;
        },
        //返回数据项的位置信息，需要是AMap.LngLat实例，或者是经纬度数组，比如[116.789806, 39.904989]
        getPosition: function(dataItem) {
            return dataItem.position;
        },
        //返回数据项对应的Marker
        getMarker: function(dataItem, context, recycledMarker) {

            //marker的标注内容
            var content = dataItem.markerLabel;

            var label = {
                offset: new AMap.Pixel(16, 18), //修改label相对于marker的位置
                content: content
            };

            //存在可回收利用的marker
            if (recycledMarker) {
                //直接更新内容返回
                recycledMarker.setLabel(label);
                return recycledMarker;
            }

            //返回一个新的Marker
            return new AMap.Marker({
                label: label
            });
        },
        //返回数据项对应的infoWindow
        getInfoWindow: function(dataItem, context, recycledInfoWindow) {

            let tpl = '<ul><li>车辆ID: <%- dataItem.id %></li><li>车辆位置: <%- dataItem.position %></li><li>车辆状态: <%- dataItem.status %></li><li>车辆描述: <%- dataItem.listDesc %></li></ul>';

            //MarkerList.utils.template支持underscore语法的模板
            let content = MarkerList.utils.template(tpl, {
                dataItem: dataItem,
                dataIndex: context.index
            });

            if (recycledInfoWindow) {
                //存在可回收利用的infoWindow, 直接更新内容返回
                recycledInfoWindow.setContent(content);
                return recycledInfoWindow;
            }

            //返回一个新的InfoWindow
            return new AMap.InfoWindow({
                offset: new AMap.Pixel(0, -23),
                content: content
            });
        },
        //返回数据项对应的列表节点
        getListElement: function(dataItem, context, recycledListElement) {

            let tpl = '<p><%- dataItem.id %>：<%- dataItem.listDesc %><p>';

            let content = MarkerList.utils.template(tpl, {
                dataItem: dataItem,
                dataIndex: context.index
            });

            if (recycledListElement) {
                //存在可回收利用的listElement, 直接更新内容返回
                recycledListElement.innerHTML = content;
                return recycledListElement;
            }

            //返回一段html，MarkerList将利用此html构建一个新的dom节点
            return '<li>' + content + '</li>';
        }
    });

    //监听选中改变
    markerList.on('selectedChanged', function(event, info) {
        //console.log(event, info);
    });

    //监听Marker和ListElement上的点击
    markerList.on('markerClick listElementClick', function(event, record) {
        //console.log(event, record);
    });

    //构建一个数据项数组，数据项本身没有格式要求，但需要支持getDataId和getPosition
    let data = [{
        id: 'A',
        position: [114.994099,27.144202],
        markerLabel: '赣D32100',
        status: '熄火',
        infoWinContent: '',
        listDesc: '别克英朗 赣D32100'
    }, {
        id: 'B',
        position: [114.994599,27.144202],
        markerLabel: '赣D32101',
        status: '熄火',
        infoWinContent: '',
        listDesc: '奥迪A8 赣D32101'
    }, {
        id: 'C',
        position: [114.994299,27.144902],
        markerLabel: '赣D32102',
        status: '熄火',
        infoWinContent: '',
        listDesc: '奥迪A6 赣D32102'
    }];

    //展示该数据
    markerList.render(data);
});