package com.alibaba.wmq.dto;

import com.alibaba.wmq.dto.data.CustomerDTO;
import lombok.Data;

@Data
public class CustomerAddCmd{

    private CustomerDTO customerDTO;

}
