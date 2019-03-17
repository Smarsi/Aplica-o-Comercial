package com.example.luisgfoliveira1.lojinhob.servico;

import com.example.luisgfoliveira1.lojinhob.models.CadFuncionarios;
import com.example.luisgfoliveira1.lojinhob.models.Funcionarios;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ServicoFuncionarios {

    @GET("jsonfun/listar.php")
    Call<List<Funcionarios>> getFuncionarios();



    @POST("jsonfun/login.php")
    Call<Funcionarios> login(@Body Funcionarios funcionarios);


    @PUT("jsonfun/")
    Call<Funcionarios> upFuncionarios(@Path("id") int id, @Body Funcionarios funcionarios);

}
