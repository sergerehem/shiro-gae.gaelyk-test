import com.google.appengine.api.datastore.*
import com.deluan.shiro.gae.realm.DatastoreRealm
import org.apache.shiro.crypto.hash.Sha512Hash

def saveUser(username, password) {
    Entity entity = new Entity(DatastoreRealm.DEFAULT_USER_STORE_KIND)

    entity.username = username
    entity.passwordHash = new Sha512Hash(password).toHex()

    entity.save()
    return entity
}


saveUser("admin", "admin")
saveUser("user1", "pass1")

println "Created Users:<br/><br/>"
println "admin / admin<br/>"
println "user1 / pass1<br/>"
