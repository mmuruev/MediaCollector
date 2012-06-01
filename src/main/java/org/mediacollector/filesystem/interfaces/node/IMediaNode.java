package org.mediacollector.filesystem.interfaces.node;

import org.apache.commons.vfs.FileObject;
import org.mediacollector.filesystem.interfaces.node.files.ICoverFilesCollection;
import org.mediacollector.filesystem.interfaces.node.files.IDescribeFilesCollection;
import org.mediacollector.filesystem.interfaces.node.files.IMediaFileCollection;
import org.mediacollector.filesystem.interfaces.node.files.ISubtitleFilesCollection;

/**
 * Created with IntelliJ IDEA.
 * User: mf
 * Date: 29.05.12
 * Time: 12:46
 * The interface describe one node
 */
public interface IMediaNode
{
    /**
     * Set media file in this node
     *
     * @param mediaFile object mediafile
     */
    public void setMediaFile(FileObject mediaFile);

    /**
     * Set subtitle file in this node
     *
     * @param subtitleFile subtitle object
     */
    public void setSubtitleFile(FileObject subtitleFile);

    /**
     * Set describe file in this node
     *
     * @param describeFile describe object
     */
    public void setDescribeFile(FileObject describeFile);

    /**
     * Set cover file in this node
     *
     * @param coverFile cover file object
     */
    public void setCoverFile(FileObject coverFile);

    /**
     * Get all media files from this node
     *
     * @return media files collection
     */
    public IMediaFileCollection getMediaFiles();

    /**
     * Get all subtitles from this node
     *
     * @return subtitle files collection
     */
    public ISubtitleFilesCollection getSubtitleFiles();

    /**
     * Get all describe files from this node
     *
     * @return describe files collection
     */
    public IDescribeFilesCollection getDescribeFiles();

    /**
     * Get all covers from this node
     *
     * @return cover files collection
     */
    public ICoverFilesCollection getCoverFiles();
}
