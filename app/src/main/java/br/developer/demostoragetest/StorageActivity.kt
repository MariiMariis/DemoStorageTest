package br.developer.demostoragetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.net.toUri
import com.google.firebase.storage.FirebaseStorage
import java.io.File

class StorageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //region $Firebase Storage

        /*//Download
        val firebaseStorage = FirebaseStorage.getInstance()

        val storageReference = firebaseStorage.reference

        val fileReference = storageReference.child("wallpapers").child("creationofman.jpg")

        val file = File(filesDir, "natureza.jpg")

        val task = fileReference.getFile(file)

        task.addOnSuccessListener {
            Log.i("FirebaseStorage","Imagem Carregada")
        }.addOnFailureListener{
            Log.i("FirebaseStorage", "Imagem Falhou!: ${it.message}")
        }

        //Upload
        val firebaseStorageUpload = FirebaseStorage.getInstance()

        val storageReferenceUpload = firebaseStorageUpload.reference

        val fileReferenceUpload = storageReferenceUpload.child("wallpapers").child("creationofman.jpg")

        val fileUpload = File(filesDir, "natureza.jpg")

        val taskUpload = fileReferenceUpload.putFile(fileUpload.toUri())

        taskUpload.addOnSuccessListener {
            Log.i("FirebaseStorage","Imagem Enviada!")
        }.addOnFailureListener{
            Log.i("FirebaseStorage", "Imagem Falhou o envio!: ${it.message}")
        }*/
        //endregion
    }
}