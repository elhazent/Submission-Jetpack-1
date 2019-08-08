package education.elhazent.com.mysubmission.model;

public class MoviesEntity {

    private String movieId;
    private String overview;
    private String originallanguage;
    private String originaltitle;
    private Boolean video = false;
    private String title;
    private String releaseDate;
    private Double voteAverange;
    private Double popularity;
    private String runTime;
    private Integer imagePath;
    private Integer imageBackDroph;


    public MoviesEntity(String movieId, String overview, String originallanguage, String originaltitle, Boolean video, String title, String releaseDate, Double voteAverange, Double popularity, String runTime, Integer imagePath, Integer imageBackDroph) {
        this.movieId = movieId;
        this.overview = overview;
        this.originallanguage = originallanguage;
        this.originaltitle = originaltitle;
        this.video = video;
        this.title = title;
        this.releaseDate = releaseDate;
        this.voteAverange = voteAverange;
        this.popularity = popularity;
        this.runTime = runTime;
        this.imagePath = imagePath;
        this.imageBackDroph = imageBackDroph;
    }

    public MoviesEntity() {
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getOriginallanguage() {
        return originallanguage;
    }

    public void setOriginallanguage(String originallanguage) {
        this.originallanguage = originallanguage;
    }

    public String getOriginaltitle() {
        return originaltitle;
    }

    public void setOriginaltitle(String originaltitle) {
        this.originaltitle = originaltitle;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getVoteAverange() {
        return voteAverange;
    }

    public void setVoteAverange(Double voteAverange) {
        this.voteAverange = voteAverange;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public Integer getImagePath() {
        return imagePath;
    }

    public void setImagePath(Integer imagePath) {
        this.imagePath = imagePath;
    }

    public Integer getImageBackDroph() {
        return imageBackDroph;
    }

    public void setImageBackDroph(Integer imageBackDroph) {
        this.imageBackDroph = imageBackDroph;
    }
}
