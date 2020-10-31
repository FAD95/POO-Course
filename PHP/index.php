<?php
require_once "car.php";
require_once "uberX.php";
require_once "uberPool.php";
require_once "account.php";

$uberX = new UberX("AMQ123", new Account("Fadith Escorcia","123456789"), "Chevrolet", "Spark");
$uberX->printCarData();

$uberPool = new UberPool("QWE258", new Account("Camila Troncoso","123456789"),"Hyundai","Elantra");
$uberPool->printCarData();
?>