<?php

	include_once 'database.php';
	include_once 'form.php';

	if(isset($_POST['submit'])){

		$Fname = $_POST['firstname'];
		$Lname = $_POST['lastname'];
		$Sname = $_POST['screenname'];
		$dob = "$_POST[dobYear]-$_POST[dobMonth]-$_POST[dobDay]";
		$inputdob = date("Y-m-d", strtotime($dob));
		$gender = $_POST['gender'];
		$country = $_POST['country'];
		$email = $_POST['email'];
		$phone = $_POST['phone'];
		$password = $_POST['pwd'];
		$cpassword = $_POST['cpwd'];

		if($password != $cpassword){
			echo 'missmatch';
		}
		else{
		
		$sql = "INSERT INTO user (first_name, last_name, screen_name, dob, gender, country, email, phone, password) VALUES ('$Fname', '$Lname', '$Sname', '$inputdob', '$gender', '$country', '$email', '$phone', '$password')";

		
			if (!mysqli_query($con, $sql) ){
				echo "Not Inserted";
			}
			else{
				echo "Inserted";
			}
		}
		
		header ("refresh:1; url=form.php");
	}

	if(isset($_POST['select'])){
	
		$sql = "SELECT * FROM user WHERE id=1";
		$result = mysqli_query($con, $sql);

		while ($row=mysqli_fetch_array($result)){
			echo($row['first_name']);
		}
	}
?>