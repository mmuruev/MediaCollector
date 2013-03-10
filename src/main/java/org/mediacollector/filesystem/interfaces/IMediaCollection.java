package org.mediacollector.filesystem.interfaces;

import org.mediacollector.filesystem.interfaces.node.IMediaNode;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: mf
 * Date: 29.02.12
 * Time: 12:14
 * The interface describe access to whole collection for all supporting types
 */
public interface IMediaCollection
{
    /**
     *  Get movies or video element from collection by name
     * @param sMovieName element name for search
     * @return  if exist will return node object
     */
    public IMediaNode getMovie(String sMovieName);

    /**
     *  Get all movie elements from collection
     * @return collection with all movies elements
     */
    public Collection<IMediaNode> getAllMovies();

    /**
     *  Get music or song element from collection by name
     * @param sMusicName  element name fro seach
     * @return if exist will return node object
     */
    public IMediaNode getMusic(String sMusicName);

    /**
     *  Get all music and/or song elements from collection
     * @return  collection with all movies elements
     */
    public Collection<IMediaNode> getAllMusic();
}
