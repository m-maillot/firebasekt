package com.firebase.wrappers.admin.firestore

import kotlin.js.Promise

external interface CollectionReference {
    val id: String
    val parent: DocumentReference?
    val path: String

    fun doc(documentPath: String?): DocumentReference
    fun add(data: DocumentData): Promise<DocumentReference>
}