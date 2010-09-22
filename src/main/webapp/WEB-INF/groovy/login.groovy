import org.apache.shiro.subject.Subject
import org.apache.shiro.SecurityUtils
import org.apache.shiro.authc.UsernamePasswordToken

log.info request.getAttribute('username')
log.info request.getAttribute('password')

Subject currentUser = SecurityUtils.getSubject()
UsernamePasswordToken token = new UsernamePasswordToken("admin", "admin")

currentUser.login token
