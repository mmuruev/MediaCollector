package org.mediacollector.filesystem.interfaces.node.files;

import org.apache.commons.vfs2.FileObject;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: mf
 * Date: 29.02.12
 * Time: 12:41
 * The interface describe collection that contain all media files one node
 */
public interface IMediaFileCollection
{
    /**
     *  Get element from collection by name
     * @param sNameMediaFile   name of element
     * @return    FileObject element
     */
    public FileObject get(String sNameMediaFile);

    /**
     *  Replace collection on the new one
     * @param mediaCollection new collection of media files
     */
    public void putAll(IMediaFileCollection mediaCollection);

    /**
     *  Put new element in collection
     * @param media new element of media file
     */
    public void put(FileObject media);

    /**
     *  Remove element from collection by name
     * @param sNameMediaFile string with name element for remove
     */
    public void remove(String sNameMediaFile);
}
