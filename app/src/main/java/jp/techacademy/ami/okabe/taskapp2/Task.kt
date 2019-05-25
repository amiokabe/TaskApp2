package jp.techacademy.ami.okabe.taskapp2

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.Date
import java.io.Serializable

open class Task: RealmObject(), Serializable {
    var category: String = ""
    var title: String = ""
    var contents: String = ""
    var date: Date = Date()

    @PrimaryKey
    var id: Int = 0
}