<html>
    <body>

    <h1>Please identify yourself:</h1>
    <form name="loginForm" action="/login.gtpl" method="post">
      <input type="text" name="username" /> <br/>
      <input type="password" name="password" /> <br/>
      <input type="hidden" name="rememberMe" value="false"/>
      <input type="submit" value="login"/>
    </form>
    <br/>
    <br/>
    <br/>
    <a href="createUsers.groovy">Create some users</a>, if you haven't done it yet
    </body>
</html>