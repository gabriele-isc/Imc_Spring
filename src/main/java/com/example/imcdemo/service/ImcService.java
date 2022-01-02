package com.example.imcdemo.service;

public class ImcService {

   public float ImcCalcular(float peso, float altura){
       return  (float) (peso/Math.pow(altura,2));
   }
}
