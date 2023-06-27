package com.alibaba.wmq.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.wmq.dto.CustomerAddCmd;
import com.alibaba.wmq.dto.CustomerListByNameQry;
import com.alibaba.wmq.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
