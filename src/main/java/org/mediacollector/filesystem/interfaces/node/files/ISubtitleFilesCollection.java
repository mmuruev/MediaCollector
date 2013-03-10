package org.mediacollector.filesystem.interfaces.node.files;

import org.apache.commons.vfs2.FileObject;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 * User: mf
 * Date: 29.02.12
 * Time: 12:40
 * The interface describe collection that contain all subtitles in one node
 */
public interface ISubtitleFilesCollection
{
    /**
     *  Get subtitle file by name
     * @param sNameSubtitle
     * @return  element from collection if exist
     */
    public FileObject get(String sNameSubtitle);

    /**
     *  Replace collection on the new one
     * @param subtitleCollection  new collection
     */
    public void putAll(ISubtitleFilesCollection subtitleCollection);

    /**
     *  Put a new element in the collection
     * @param subtitle new element
     */
    public void put(FileObject subtitle);

    /**
     *  Remove element from collection by name
     * @param sNameSubtitle element for remove
     */
    public void remove(String sNameSubtitle);
}
