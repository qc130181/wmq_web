package com.alibaba.wmq.domain.customer.gateway;

import com.alibaba.wmq.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
