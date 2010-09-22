<html>
    <body>
        <h1>Please identify yourself:</h1>
        <form action="/login.gtpl" method="POST">
          <input type="textfile" name="username" value="${request.getAttribute('username')}"> <br/>
          <input type="password" name="password"> <br/>
          <input type="hidden" name="rememberMe" value="false"
          <input type="submit" value="login">
        </form>
        <h2>${request.getAttribute('failureKeyAttribute')}</h2>
    </body>
</html>