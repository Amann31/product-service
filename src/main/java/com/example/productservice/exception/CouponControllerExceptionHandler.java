package com.example.productservice.exception;



import com.example.productservice.ui.ErrorResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CouponControllerExceptionHandler {


    @ExceptionHandler
    public ResponseEntity<ErrorResponseModel> handleUserNotFoundException(CouponNotFoundException e) {
        ErrorResponseModel errorResponseModel = new ErrorResponseModel();
        errorResponseModel.setErrorMessage(e.getMessage());
        errorResponseModel.setErrorTime(System.currentTimeMillis());
        errorResponseModel.setErrorCode(HttpStatus.NOT_FOUND.value());
        return new ResponseEntity<ErrorResponseModel>(errorResponseModel,HttpStatus.NOT_FOUND);
    }

}
