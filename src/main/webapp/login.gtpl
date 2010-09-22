<html>
    <body>
        <h1>Please identify yourself:</h1>
        <form action="/login.groovy" method="POST">
          <input type="text" name="username" /> <br/>
          <input type="password" name="password" /> <br/>
          <input type="hidden" name="rememberMe" value="false"/>
          <input type="submit" value="login"/>
        </form>
    </body>
</html>