package com.alibaba.wmq.domain.customer.gateway;

import com.alibaba.wmq.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
