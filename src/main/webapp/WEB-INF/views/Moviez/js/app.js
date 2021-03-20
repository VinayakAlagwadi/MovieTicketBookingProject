jQuery(function($) {

    $('.movies-tabs-1').tabs();
    $('.movies-tabs-2').tabs();

    /* season and episode tabs */
    $('.tab').click(function(){
        var tabID = $(this).data('tabid');

        $('.buttons').children().removeClass('current');

        $(this).addClass('current');

        $('.tv-wrapper').children().hide();
        $('.tv-wrapper').find("[data-blockid="+tabID+"]").show();
    });

    /*==== video popup ====*/
    $(document).ready(function() {
        // Gets the video src from the data-src on each button

        var $videoSrc;
        $('.video-btn').click(function() {
            $videoSrc = $(this).data( "src" );
        });
        console.log($videoSrc);

        // when the modal is opened autoplay it
        $('#call-video').on('shown.bs.modal', function (e) {

        // set the video src to autoplay and not to show related video. Youtube related video is like a box of chocolates... you never know what you're gonna get
            $("#video").attr('src',$videoSrc + "?rel=0&amp;showinfo=0&amp;modestbranding=1&amp;autoplay=1" );
        })

        // stop playing the youtube video when I close the modal
        $('#call-video').on('hide.bs.modal', function (e) {
            // a poor man's stop video
            $("#video").attr('src',$videoSrc);
        })
    });

    /*=== Navbar script ===*/
    $(window).scroll(function(){

        if($(window).scrollTop() > 30) {
              $('.navbar').addClass('navbar-bg').fadeIn(300);
          } 
            else{
                $('.navbar').removeClass('navbar-bg').fadeIn(300);
            }
        });

    if($(window).scrollTop() > 30){
        $('.navbar').addClass('navbar-bg').fadeIn(300);
    }




    $(".moviez-2").owlCarousel({
        autoPlay: true,
        loop: true,
        nav: false,
        margin: 15,
        dots: false,
        navText: ['<i class="lnr lnr-chevron-left"></i>', '<i class="lnr lnr-chevron-right"></i>'],
        responsiveClass:true,
        responsive:{
            0:{
                items:1
            },
            400:{
                items:2
            },
            700:{
                items:3
            },
            1200:{
                items:4
            },
            1550:{
                items:5
            }
        }
    });

    $(".movie-showcase-1, .movie-showcase-2, .movie-showcase-3 ").owlCarousel({
        autoPlay: false,
        loop: true,
        nav: true,
        margin: 15,
        dots: false,
        navText: ['<i class="ion ion-chevron-left"></i>', '<i class="ion ion-chevron-right"></i>'],
        responsiveClass:true,
        responsive:{
            0:{
                items:1,
            },
            500:{
                items:2,
            },
            850:{
                items:3,
            },
            1400:{
                items:4,
            },
            1650:{
                items:5,
            }
        }
    });

    $(".movie-showcase-4").owlCarousel({
        autoPlay: false,
        loop: true,
        nav: true,
        margin: 20,
        dots: false,
        navText: ['<i class="ion ion-android-arrow-back"></i>', '<i class="ion-android-arrow-forward"></i>'],
        responsiveClass:true,
        responsive:{
            0:{
                items:1,
                nav: true
            },
            350:{
                items:2,
                nav: true
            },
            600:{
                items:3,
                nav: true
            },
            900:{
                items:4,
                nav: true
            },
            1100:{
                items:5,
                loop:true,
                nav: true,
            },
            1400:{
                items:7,
                loop:true,
                nav: true,
            }
        }
    });

    $(".movie-showcase-5, .movie-showcase-5-1, .movie-showcase-6").owlCarousel({
        autoPlay: false,
        loop: true,
        nav: true,
        margin: 20,
        dots: false,
        navText: ['<i class="ion ion-android-arrow-back"></i>', '<i class="ion-android-arrow-forward"></i>'],
        responsiveClass:true,
        responsive:{
            0:{
                items:1,
                nav: true
            },
            350:{
                items:2,
                nav: true
            },
            600:{
                items:3,
                nav: true
            },
            900:{
                items:4,
                nav: true
            },
            1100:{
                items:5,
                loop:true,
                nav: true,
            },
            1400:{
                items:6,
                loop:true,
                nav: true,
            }
        }
    });

    $(".movie-showcase-7").owlCarousel({
        autoPlay: true,
        loop: true,
        nav: true,
        margin: 0,
        dots: false,
        navText: ['<i class="ion ion-ios-arrow-left"></i>', '<i class="ion ion-ios-arrow-right"></i>'],
        responsiveClass:true,
        responsive:{
            0:{
                items:1,
                nav: true
            },
            600:{
                items:2,
                nav: true
            },
            1000:{
                items:3,
                loop:true,
                nav: true,
            },
            1100:{
                items:4,
                loop:true,
                nav: true,
            },
            1500:{
                items:5,
                loop:true,
                nav: true,
            },
            1600:{
                items:6,
                loop:true,
                nav: true,
            }
        }
    });

    $(".movie-showcase-8").owlCarousel({
        autoPlay: true,
        loop: true,
        nav: true,
        margin: 0,
        dots: false,
        navText: ['<i class="ion ion-ios-arrow-left"></i>', '<i class="ion ion-ios-arrow-right"></i>'],
        responsiveClass:true,
        responsive:{
            0:{
                items:1,
                nav: true
            },
            720:{
                items:2,
                nav: true
            }
        }
    });

    $(".movie-showcase-9").owlCarousel({
        autoPlay: true,
        loop: true,
        nav: true,
        margin: 0,
        dots: false,
        navText: ['<i class="ion ion-ios-arrow-left"></i>', '<i class="ion ion-ios-arrow-right"></i>'],
        responsiveClass:true,
        responsive:{
            0:{
                items:1
            },
            720:{
                items:2
            },
            1150:{
                items:3
            }
        }
    });
    $(".movie-showcase-10").owlCarousel({
        autoPlay: true,
        loop: true,
        nav: true,
        margin: 0,
        dots: false,
        navText: ['<i class="ion ion-ios-arrow-left"></i>', '<i class="ion ion-ios-arrow-right"></i>'],
        responsiveClass:true,
        responsive:{
            0:{
                items:1
            },
            720:{
                items:1
            },
            1150:{
                items:1
            }
        }
    });
    
})