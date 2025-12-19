package com.example.demo.service.Impl;


package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PathVariable;
 

import org.springframework.stereotype.Service;
import com.example.demo.repository.Timestamprepo;
import com.example.demo.entity.Timestamp;
import com.example.demo.service.Timestampservice;
// import com.example.demo.exception.Validationexception;
// import javl.List;


@Service  
public class TimestampserviceImpl implements Timestampservice{   //splited as 2 layers here

            @Autowired Timestamprepo timerepo; 
            //save()-insert,update
            //findall(),findById(),deleteById(),existById()

            @Override
            public  Timestamp timeData(Timestamp timesof){
               return timerepo.save(timesof);
            }

            
}