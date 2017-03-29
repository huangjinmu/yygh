<%--
  Created by IntelliJ IDEA.
  User: jim
  Date: 2017/3/28
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-ch">
<head>
    <meta charset="UTF-8">
    <title>第7步：作业-按科室挂号</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/client/css/layout.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/client/css/base.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/client/css/ui-component.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/client/css/department.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/client/js/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/client/js/ui.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/client/js/department.js"></script>
    <script type="text/javascript">
        $(function () {

            $.ajax({
                type : "post",
                url : "${pageContext.request.contextPath}/ksxxController/findAllKsxx.action",
                data : {id :0},
                dataType : "json",
                success : function(data) {
                    if(data!=null && data!=undefined){
                        var rows =data.rows;
                        createksxx(rows);
                    }
                    alert("success");
                    alert(data);
                    console.log(data);
                },
                error : function(data) {
                        alert("错了")
                }
            });
            //生成科室列表
            function createksxx(rows) {
                $('.side').empty();
                $('.content').empty();
                if(rows!=null&&rows!=undefined&&rows.length>0){
                    for(var i =0;i<rows.length;i++){
                        var caption =rows[i].ksName;
                        var ksid=rows[i].id;
                        var list=rows[i].childrenKsxxCustom;
                        $('.side').append('<a href="#d_'+i+'" class="item"><i style="background-position:0 -'+i*22+'px" class="icon"></i>'+caption+'</a>')
                        //生成父科室列表
                        var html = ['<div class="group"><div class="caption"><a name="#d_'+i+ksid+'"></a>'+caption+'</div><div class="list">']
                        //	输出子科室列表内容
                        if(list!=null&&list!=undefined){
                            for (var j=0;j<list.length;j++){
                                var ks_id=list[j].id;
                                html .push('<a href="${pageContext.request.contextPath}/ysxxController/ysxxList.action?id='+ks_id+'" class="item">'+list[j].ksName+'</a>');
                            }
                        }

                        html .push('</div></div>');
                        $('.content').append(html.join(''));
                    }

                }
            }
        })
    </script>
</head>
<body>
<div id="top" class="top">
    <div class="wrap">
        <p class="call">010-114/116114电话预约</p>
        <p class="welcome">欢迎来到城市市预约挂号统一平台&nbsp;请&nbsp;
            <a href="#1">登录</a>
            <a href="#2">注册</a>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <a href="#3">帮助中心</a>
        </p>
    </div>
</div>
<div id="header" class="header">
    <div class="wrap">
        <a href="#4" class="logo"><img src="img/logo.png"></a>
        <div class="search ui-search">
            <div class="ui-search-selected">医院</div>
            <div class="ui-search-select-list" >
                <a href="#">科室</a>
                <a href="#">疾病</a>
                <a href="#">医院</a>
            </div>
            <input type="text" name="" class="ui-search-input" placeholder="请输入搜索内容" />
            <a href="#" class="ui-search-submit">&nbsp;</a>
        </div>
    </div>
</div>
<div id="nav" class="nav">
    <div class="wrap">
        <a href="#6" class="link">首页</a>

        <a href="department.html" class="link link_focus">按科室挂号</a>

        <a href="#6" class="link">最新公告</a>

    </div>
</div>

<!-- 按科室内容挂号 -->

<div class="hot wrap">
    <div class="caption">热门科室</div>
    <div class="list clearfix">
        <a href="#1" class="item">神经外科</a>
        <a href="#1" class="item">妇科</a>
        <a href="#1" class="item">产科</a>
        <a href="#1" class="item">儿科</a>
        <a href="#1" class="item">骨科</a>
        <a href="#1" class="item">眼科</a>
        <a href="#1" class="item">耳鼻喉</a>
        <a href="#1" class="item">肿瘤外科</a>
        <a href="#1" class="item">肿瘤综合科</a>
        <a href="#1" class="item">皮肤美容</a>
        <a href="#1" class="item">心理咨询科</a>
        <a href="#1" class="item">中医科</a>
        <a href="#1" class="item">急诊科</a>
        <a href="#1" class="expand">展开全部</a>
    </div>
</div>

<div class="main wrap clearfix">
    <div class="side">
        <a href="" class="item"><i class="icon"></i>策四</a>
        <a href="" class="item"><i class="icon"></i>策四</a>
        <a href="" class="item"><i class="icon"></i>策四</a>
    </div>
    <div class="content">

        <div class="group">

        </div>
        <div class="group">

        </div>



    </div>
</div>
<div id="jim" style="text-align: center">黄金木</div>

<!-- 按科室内容挂号 end -->

<div id="footer" class="footer">
    <div class="wrap">
        <img src="client/img/footer-logo.jpg">
        <div class="list">
            <a href="#9" class="link">联系我们</a><a href="#9" class="link">合作伙伴</a><a href="#9" class="link">法律声明 </a><a href="#9" class="link">服务协议</a><a href="#9" class="link">意见反馈</a>
            <div class="icp">版权所有:京ICP备05056889号</div>
        </div>
    </div>
</div>
<a href="#0" class="go-top"></a>

</body>
</html>
