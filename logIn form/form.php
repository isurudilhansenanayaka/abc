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