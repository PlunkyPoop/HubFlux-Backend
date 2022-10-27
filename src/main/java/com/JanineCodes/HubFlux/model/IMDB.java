package com.JanineCodes.HubFlux.model;

import lombok.Data;

import java.util.ArrayList;
@Data
public class IMDB {

    // import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
    public String id;
    public String title;
    public String originalTitle;
    public String fullTitle;
    public String type;
    public String year;
    public String image;
    public String releaseDate;
    public String runtimeMins;
    public String runtimeStr;
    public String plot;
    public String plotLocal;
    public boolean plotLocalIsRtl;
    public String awards;
    public String directors;
    public ArrayList<DirectorList> directorList;
    public String writers;
    public ArrayList<WriterList> writerList;
    public String stars;
    public ArrayList<StarList> starList;
    public ArrayList<ActorList> actorList;
    public Object fullCast;
    public String genres;
    public ArrayList<GenreList> genreList;
    public String companies;
    public ArrayList<CompanyList> companyList;
    public String countries;
    public ArrayList<CountryList> countryList;
    public String languages;
    public ArrayList<LanguageList> languageList;
    public String contentRating;
    public String imDbRating;
    public String imDbRatingVotes;
    public Object metacriticRating;
    public Object ratings;
    public Object wikipedia;
    public Object posters;
    public Object images;
    public Object trailer;
    public BoxOffice boxOffice;
    public Object tagline;
    public String keywords;
    public ArrayList<Object> keywordList;
    public ArrayList<Object> similars;
    public Object tvSeriesInfo;
    public TvEpisodeInfo tvEpisodeInfo;
    public Object errorMessage;

    public static class ActorList{
        public String id;
        public String image;
        public String name;
        public String asCharacter;
    }

    public static class BoxOffice{
        public String budget;
        public String openingWeekendUSA;
        public String grossUSA;
        public String cumulativeWorldwideGross;
    }

    public static class CompanyList{
        public String id;
        public String name;
    }

    public static class CountryList{
        public String key;
        public String value;
    }

    public static class DirectorList{
        public String id;
        public String name;
    }

    public static class GenreList{
        public String key;
        public String value;
    }

    public static class LanguageList{
        public String key;
        public String value;
    }

    public class Root{

    }

    public static class StarList{
        public String id;
        public String name;
    }

    public static class TvEpisodeInfo{
        public String seriesId;
        public String seriesTitle;
        public String seriesFullTitle;
        public String seriesYear;
        public String seriesYearEnd;
        public String seasonNumber;
        public String episodeNumber;
        public String previousEpisodeId;
        public String nextEpisodeId;
    }

    public static class WriterList{
        public String id;
        public String name;
    }


}
