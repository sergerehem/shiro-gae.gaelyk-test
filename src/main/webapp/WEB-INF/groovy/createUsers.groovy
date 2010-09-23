import com.deluan.shiro.gae.realm.DatastoreRealm
import com.google.appengine.api.datastore.Entity
import com.google.appengine.api.datastore.Query
import org.apache.shiro.crypto.hash.Sha512Hash

def saveUser(username, password) {
    Entity entity = new Entity(DatastoreRealm.DEFAULT_USER_STORE_KIND)

    entity.username = username
    entity.passwordHash = new Sha512Hash(password).toHex()

    entity.save()
    return entity
}

def hasUsers() {
    def query = new Query(DatastoreRealm.DEFAULT_USER_STORE_KIND)
    def result = datastore.prepare(query).countEntities() > 0
}


if (!hasUsers()) {
    saveUser("admin", "admin")
    saveUser("user1", "pass1")
    println "Created some users:<br/><br/>"
} else {
    println "Users were already created:<br/><br/>"
}

println "admin / admin<br/>"
println "user1 / pass1<br/>"

println "<br/><a href=\"/\">back</a>"
