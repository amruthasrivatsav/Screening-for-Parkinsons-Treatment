#!/bin/bash
COUNTER=50 FileSuffix="_mol.config" PdbqtSuffix="_mol.pdbqt"
while [ $COUNTER -lt 647 ]; do
    echo The counter is $COUNTER
    let COUNTER=COUNTER+1 ConfigFile="../pdbqt/$COUNTER$FileSuffix"
    echo "receptor=1xq8MIN.pdbqt" >> $ConfigFile
    echo "ligand=$COUNTER$PdbqtSuffix" >> $ConfigFile echo "size_x=30" >> $ConfigFile
    echo "size_y=30" >> $ConfigFile
    echo "size_z=30" >> $ConfigFile
    echo "center_x=246.16" >> $ConfigFile
    echo "center_y=49.719" >> $ConfigFile
    echo "center_z=-25.058" >> $ConfigFile
done