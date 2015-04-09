library c
	function foo takes nothing returns integer
		return 1
	endfunction
endlibrary
library a
	function _foo takes nothing returns boolean
		return true
	endfunction	
endlibrary
library b
	function bar takes nothing returns integer
		   return foo()
	endfunction
endlibrary

