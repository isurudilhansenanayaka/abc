<?php

	$host = 'localhost';
	$username = 'root';
	$password = '';
	$db = 'registration';
	
	$con = mysqli_connect($host, $username, $password);
	
	if (!$con){
		echo "Not Connected To Server";
	}
	
	if (!mysqli_select_db($con, $db)){
		echo 'Database Not Selected';
	}


	
	
?>