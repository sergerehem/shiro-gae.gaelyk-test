<% include '/WEB-INF/includes/header.gtpl' %>

<h1>Please identify yourself</h1>
<form name="loginForm" action="/login.gtpl" method="post">
  <input type="text" name="username" /> <br/>
  <input type="password" name="password" /> <br/>
  <input type="submit" value="login"/>
</form>
<br/>
<br/>
  <p>Use:</p>
  <p>admin/admin or user1/pass1</p>
<br/>
<br/>
<br/>
<a href="createUsers.groovy">Create some users</a>, if you haven't done it yet

<% include '/WEB-INF/includes/footer.gtpl' %>