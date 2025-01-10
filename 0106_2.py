# -*- coding: utf-8 -*-
"""
Created on Mon Jan  6 12:13:10 2025

@author: tjoen
"""
data = [['ghdrlfehd','10','eowjstl'],['rlarkqehd','20','tlschs']]
file = open("./data/temp.txt","w")
for datum in data:
    data_str = " ".join(datum)
    file.write(data_str)
file.close()

file = open("./data/temp.txt","r")
line_list = file.readlines()
file.close()
idx = 0
for line in line_list:
    idx += 1
    line_feature = line split(" ")
    line_feature.insert(0,idx)
    line_str = ",".join(line_feature)
    file.write(line_str)
file(close)