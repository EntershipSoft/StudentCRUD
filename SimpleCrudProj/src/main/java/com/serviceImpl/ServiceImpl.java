package com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.daoInterface.DaoInterface;
import com.serviceInterface.ServiceInterface;

public class ServiceImpl implements ServiceInterface {
@Autowired
DaoInterface di;
}
