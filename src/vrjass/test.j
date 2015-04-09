library c
	function foo takes nothing returns integer
		return 1
	endfunction
endlibrary
library a
	function pocho takes nothing returns boolean
		return false
	endfunction

	function _foo takes nothing returns boolean
		return true or pocho()
	endfunction	
endlibrary
library b
	function bar takes nothing returns integer
		   return foo()
	endfunction
endlibrary

