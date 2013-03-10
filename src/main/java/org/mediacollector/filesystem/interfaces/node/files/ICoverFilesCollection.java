package org.mediacollector.filesystem.interfaces.node.files;

import org.apache.commons.vfs2.FileObject;

/**
 * Created by IntelliJ IDEA.
 * User: mf
 * Date: 29.02.12
 * Time: 12:37
 * The interface describe collection that contain all icons in one node
 */
public interface ICoverFilesCollection
{
    /**
     * Get cover element from collection by name
     *
     * @param sNameCoverFile name for search in collection
     * @return element from collection if exist
     */
    public FileObject get(String sNameCoverFile);

    /**
     * Replace collection on the new one.
     *
     * @param coversCollection new collection
     */
    public void putAll(ICoverFilesCollection coversCollection);

    /**
     * Put a new cover element in collection
     *
     * @param cover new element
     */
    public void put(FileObject cover);

    /**
     * Remove element from collection by name
     *
     * @param sNameCover name element for remove
     */
    public void remove(String sNameCover);
}
