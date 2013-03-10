package org.mediacollector.filesystem.interfaces.node.files;

import org.apache.commons.vfs2.FileObject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: mf
 * Date: 29.02.12
 * Time: 12:39
 * The interface describe collection that contain all describe files in one node
 */
public interface IDescribeFilesCollection extends Map
{
    /**
     *  Get describe file by name
     * @param sNameDescribeFile
     * @return  element from collection if exist
     */
    public FileObject get(String sNameDescribeFile);

    /**
     *  Replace collection on the new one
     * @param describeCollection new collection
     */
    public void putAll(IDescribeFilesCollection describeCollection);

    /**
     *   Put new describe element in collection
     * @param describe  a new element
     */
    public void put(FileObject describe);

    /**
     *  Remove element from collection by name.
     * @param sNameDescribe element for remove
     */
    public void remove(String sNameDescribe);

}
