import org.apache.shiro.subject.Subject
import org.apache.shiro.SecurityUtils
import org.apache.shiro.authc.UsernamePasswordToken

Subject currentUser = SecurityUtils.getSubject()
UsernamePasswordToken token = new UsernamePasswordToken(params.username, params.password)

currentUser.login token
