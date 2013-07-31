'use strict';

angular.module('App.controllers', ['App.services']).
  controller('MainCtrl', function ($scope, $http, MyService) {
    $scope.data = [
      {name: "Tim"},
      {name: "Scooter"},
      {name: "David"},
      {name: "Jeff"},
      {name: "Eva"},
      {name: "Victor"},
      {name: "Juan"}
      ];
  });