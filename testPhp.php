<?php

use PHPUnit\Framework\TestCase;
require "functions.php";
require "config.php";

class Test extends TestCase
{
        public function testSiteName()
        {
                $aTest = config('name');
                siteName();
               $this->expectOutputString($aTest);
        }

        public function testSiteVersion()
        {
                $aTest = config('version');
                siteVersion();
               $this->expectOutputString($aTest);
        }

        public function testSiteName()
        {
            $nav_menu = '';

            foreach (config('nav_menu') as $uri => $name) {
                $nav_menu .= '<a href="/'.(config('pretty_uri') || $uri == '' ? '' : '?page=').$uri.'">'.$name.'</a>'.' | ';
            }
            $aTest = trim($nav_menu, $sep);
            navMenu(' | ');
            $this->expectOutputString($aTest);
        }


}
?>