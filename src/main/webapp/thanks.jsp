<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Thanks for Joining</title>
    <link rel="stylesheet" href="styles/main.css">
</head>
<body>
    <form style="text-align: center;">
        <h1>🎉 Thank You!</h1>
        <p>You have successfully joined our email list.</p>

        <h2>Your Information</h2>
        <ul style="list-style: none; padding: 0; margin: 15px 0; text-align: left;">
            <li><strong>Email:</strong> ${user.email}</li>
            <li><strong>First Name:</strong> ${user.firstName}</li>
            <li><strong>Last Name:</strong> ${user.lastName}</li>
        </ul>

        <input type="button" value="Return Home" onclick="window.location.href='index.html'">
    </form>

    <footer>
        <p>&copy; Copyright Mike Murach &amp; Associates</p>
    </footer>
</body>
</html>
