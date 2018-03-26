package com.firebase.wrappers.admin.firestore

external interface DocumentSnapshot {

    val exists: Boolean
    val id: String
    val ref: DocumentReference
    val metadata: SnapshotMetadata


    fun data(options: SnapshotOptions?): Any?
    fun get(fieldPath:String, options: SnapshotOptions): Any?
    fun isEqual(other: DocumentSnapshot): Boolean
}