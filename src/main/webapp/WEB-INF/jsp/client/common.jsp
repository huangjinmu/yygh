<%--
  Created by IntelliJ IDEA.
  User: jim
  Date: 2017/3/30
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
    request.setAttribute("ctx", basePath);
%>
<link rel="stylesheet" type="text/css" href="${ctx }/css/layout.css">
<link rel="stylesheet" type="text/css" href="${ctx }/css/base.css">
<link rel="stylesheet" type="text/css" href="${ctx }/css/ui-component.css">
<script type="text/javascript" src="${ctx }/client/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="${ctx }/client/js/ui.js"></script>
