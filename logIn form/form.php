<!DOCTYPE html>
<html>
<head>
	<title>form</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>

<body>

	<h2>Sign Up</h2>
	
	
	<form action="query.php" method="post">
		<div class="container">	
				<label for="firstname"> First Name:</label>
				<input type="text" name="firstname" placeholder="Enter First Name" required><br><br>

				<label for="lastname">Last Name:</label>
				<input type="text" name="lastname" placeholder="Enter Last Name" required><br><br>
				
				<label for="screenname">Screen Name:</label>
				<input type="text" name="screenname" placeholder="Enter Screen Name" required><br><br>
				
				<label for="dob">Date of Birth:</label>
				<select name="dobMonth" required>
					<!-- <option value="">Month</option> -->
					<option>January</option>
				    <option>February</option>
			        <option>March</option>
			        <option>April</option>
			        <option>May</option>
		    	    <option>June</option>
					<option>July</option>
					<option>August</option>
					<option>September</option>
		  	        <option>October</option>
		  		    <option>November</option>
		            <option>December</option>
				</select>

				<select name="dobDay" required>
					<!-- <option value="">Day</option> -->
						<?php
		            		for ($x=1; $x<=31; $x++){
		                		echo'<option value="'.$x.'">'.$x.'</option>'; 
		              		} 
		            	?>
				</select>

				<select name="dobYear" required>
		       		<!-- <option value="">Year</option> -->
						<?php
		            		for ($x=date("Y"); $x>1900; $x--){
		                		echo'<option value="'.$x.'">'.$x.'</option>'; 
		              		} 
		            	?> 
		       	</select>
		       	<br><br>
		       	
		       	<label for="gender">Gender:</label>
		       	<input type="radio" name="gender" value="male">Male
		       	<input type="radio" name="gender" value="female">Female
		       	<br><br>
		       	
		       	<label for="country">Country:</label>
		       	<select name="country" required>
				    <option>Australia</option>
			        <option>Bangladesh</option>
			        <option>Brazil</option>
		    	    <option>Canada</option>
					<option>China</option>
		  	        <option>France</option>
		  		    <option>Germany</option>
		            <option>India</option>
		            <option>Italy</option>
			        <option>Japan</option>
			        <option>Malaysia</option>
		    	    <option>Mexico</option>
					<option>New Zealand</option>
					<option>North Korea</option>
					<option>Pakistan</option>
		  	        <option>Russia</option>
		  		    <option>Singapore</option>
		            <option>Sri Lanka</option>
			        <option>United Kingdom (UK)</option>
			        <option>United States of America (USA)</option>
				</select>
				<br><br>

				<label for="email">E-mail:</label>
				<input type="email" name="email" placeholder="Enter Email" required><br><br>
				
				<label for="phone">Phone:</label>
				<input type="text" name="phone" placeholder="Enter Phone Number" pattern="[0-9]{10}" required><br><br>
				
				<label for="password">Password</label>
				<input type="password" name="pwd" placeholder="Enter Password" minlength="8" required><br><br>
				
				<label for="cpassword">Confirm Password:</label>
				<input type="password" name="cpwd" placeholder="Confirm Password" required>
				<br><br>

				<label for="cbox"></label>
				<input type="checkbox" name="cbox" required>I agree to the Terms of Use
				<br><br>
		</div>
		
		<div class="footer">
			<button type="button" name="select">Select</button>

			<button class="button" type="submit" name="submit">Submit</button>
			<button type="button">Cancel</button>
		</div>
	
	</form>

	
</body>
</html>