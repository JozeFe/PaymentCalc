'use strict';

var paymentApp = angular.module('paymentApp', ['ngRoute', 'controllers']);
var controllers = angular.module('controllers', []);

paymentApp.config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider.
        when('/calc', {templateUrl: 'calc.html', controller: 'PaymentCalcCtrl'}).
        otherwise({redirectTo: '/calc'});
    }]);

controllers.controller('PaymentCalcCtrl',
    function ($scope, $routeParams, $http, $location, $rootScope) {
        $scope.payment = {
            'months' : 0,
            'amount' : 0,
            'instalment' : 0
        };
        // function called when submit button is clicked, call calc function on server
        $scope.create = function (payment) {
            $http({
                method: 'POST',
                url: '/payment/rest/payment',
                data: payment
            }).then(function success(response) {
                $scope.payment = response.data;
            });
        };
    });

