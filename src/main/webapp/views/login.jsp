<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Login</title>
</head>
<body>
	<form action="/login" method="POST">
		<div>
			<input type="email" name="useremail" placeholder="Email ID">
		</div>

		<div>
			<input type="password" name="password" placeholder="Password">
		</div>

		<div>
			<input type="submit" name="submit" value="login">
		</div>
	</form>
</body>
</html>