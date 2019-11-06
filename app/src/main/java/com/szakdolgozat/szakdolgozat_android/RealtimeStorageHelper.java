package com.szakdolgozat.szakdolgozat_android;

import android.net.Uri;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageMetadata;
import com.google.firebase.storage.StorageReference;

public class RealtimeStorageHelper {
    FirebaseStorage storage=FirebaseStorage.getInstance();
    StorageReference storeRef=storage.getReference();

    public void setMediaReference(Post post){
        StorageReference imagesRef=storeRef.child("Post" + "/" + post.getPostName()+"/"+post.getPostMediaUri().getLastPathSegment()+"/");
        imagesRef.putFile(post.getPostMediaUri());
    }

    public Post getMediaReference(String post){
        Post retPost=new Post();

        return retPost;
    }
}

