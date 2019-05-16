/**
* 
*/
var myApp = angular.module('myApp', []);
myApp.controller('employeeController', function ($scope, $http, $window, $location) {

    // Button Settings
    $scope.submit = true;
    $scope.update = false;
    $scope.cancel = false;

    // Getting user list
    //$http GET function
    $http.get('https://jsonplaceholder.typicode.com/users')
        .then(function successCallback(response) {
            $scope.users = response.data;
        }, function errorCallback(response) {
            alert("Error. Try Again!");
        });

    //Create New Employee
    $scope.createEmployee = function () {
        //$http POST function
        $http.post('https://jsonplaceholder.typicode.com/employees', $scope.employee)
            .then(function successCallback(response) {
                $scope.users.push(response.data);
                alert("Employee has created Successfully")
            }, function errorCallback(response) {
                alert("Error. while created user Try Again!");
            });
    };

    //Update Employee
    $scope.updateEmployee = function () {
        //$http PUT function
        $http.put('https://jsonplaceholder.typicode.com/employees/' + $scope.employee.id)
            .then(function successCallback(response) {
                alert("Employee created successfully");
            }, function errorCallback(response) {
                alert("Error. while updating employee Try Again!");
            });
    };
    //Delete Employee
    $scope.deleteEmployee = function (employee) {
        //$http DELETE function
        $http.delete('https://jsonplaceholder.typicode.com/employees/' + $scope.employee.id)
            .then(function successCallback(response) {
                alert("Employee has deleted Successfully");
                var index = $scope.employees.indexOf(employee);
                $scope.employees.splice(index, 1);
            }, function errorCallback(response) {
                alert("Error. while deleting user Try Again!");
            });
    };

    // Set $scope on Edit button click
    $scope.editEmployee = function (employee) {
        $scope.employee = employee;
        $scope.submit = false;
        $scope.update = true;
        $scope.cancel = true;
    };

    // Cancel Update
    $scope.cancelUpdate = function () {
        $scope.employee = null;
        $scope.submit = true;
        $scope.update = false;
        $scope.cancel = false;
    };
});