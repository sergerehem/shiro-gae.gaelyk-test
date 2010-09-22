<html>
    <body>
        <h1>Please identify yourself:</h1>
        <form action="/login.gtpl"
                method="post" enctype="multipart/form-data">
          <input type="textfile" name="username"> <br/>
          <input type="password" name="password"> <br/>
          <input type="submit" value="login">
        </form>
        <h2>${request.getAttribute('failureKeyAttribute')}</h2>
    </body>
</html>