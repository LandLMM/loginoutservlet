<%@page language="java" contentType="text/html" %>
<html>

<body>
<h1> Welcome in login page !!</h1>

<div style="color: darkorange">This is login page please fill credentials and press submit to perform login operation
</div>
<br>
${error}
<form method="post" action="/login">
    <label>Username </label>
    <input type="text" name="username">
    <br>
    <br>
    <label>Password</label>
    <input type="password" name="password">
    <br>
    <button type="submit">LOG IN</button>
</form>


</body>

</html>