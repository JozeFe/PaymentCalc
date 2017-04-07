<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" trimDirectiveWhitespaces="true" session="false" %>
<!DOCTYPE html>
<html lang="en" ng-app="paymentApp">
<head>
    <meta charset="UTF-8">
    <title>Payment Calculator</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
    <!-- bootstrap cdn import -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <!-- angular import -->
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular-route.min.js"></script>

    <script src="${pageContext.request.contextPath}/main_angular.js"></script>
    <!-- bootstrap slider -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-slider/9.7.2/css/bootstrap-slider.min.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-slider/9.7.2/bootstrap-slider.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/custom.css">
</head>
<body>
<div class="container">
        <!-- content provided by routing -->
        <div ng-view></div>
</div>
<%--<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.min.js"></script>--%>
</body>
</html>
