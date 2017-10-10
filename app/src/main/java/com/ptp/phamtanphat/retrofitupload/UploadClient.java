package com.ptp.phamtanphat.retrofitupload;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by KhoaPhamPC on 9/10/2017.
 */

public interface UploadClient {

    @Multipart
    @POST("upload")
    Call<ResponseBody> uploadphoto(
            //Thang nay chi la string don gian thi su dung class RequestBody
            @Part("description") RequestBody description,
            //Thang nay` mo ta qua nhieu nen xai MultipartBody.Part
            @Part MultipartBody.Part photo
    );
}
